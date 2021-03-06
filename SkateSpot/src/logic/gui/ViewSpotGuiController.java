package logic.gui;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import logic.controllers.ViewSpotController;
import logic.entities.Spot;


public class ViewSpotGuiController 
{
	@FXML private Label nome;
	@FXML private Label numero;
	@FXML private Label indirizzo;
	@FXML private Label zona;
	@FXML private Label comune;
	@FXML private Label tipo;
	@FXML private Label username;
	@FXML private Label data;
	@FXML private Label descrizione;
	ArrayList<Spot> spots;
	private int i=0;
	private int first=1;
	
	public void handle(MouseEvent mouseEvent) throws IOException
    {	
        Button button = (Button) mouseEvent.getSource();
        String value = button.getText();
        switch(value)
        {
            case "":            //home button clicked --> re-open home window
            	HomeGuiController.getViewSpotStage().close();
                HomeMain.getStage().show();
                break;
               
            case "NEXT":
            	nextSpot();
            	break;
            	
            case "PREVIOUS":
            	previousSpot();
            	break;
            default:
            	break;
        } 
    }
	public void nextSpot()
	{
		spots=ViewSpotController.getInstance().getList();
		if(spots==null)
		{
			JOptionPane.showMessageDialog(null,"ERROR! No spot was found!","WARNING",JOptionPane.WARNING_MESSAGE);
		}
		else
		{
			if(first==1)
			{
				setLabels();
				first=0;
			}
			else
			{
				i++;
				if(i==spots.size())
				{
					i=0;
					setLabels();
				}
				else
				{
					setLabels();
				}
			}
		}
	}
	public void previousSpot()
	{
		spots=ViewSpotController.getInstance().getList();
		if(spots==null)
		{
			JOptionPane.showMessageDialog(null,"ERROR! No spot was found!","WARNING",JOptionPane.WARNING_MESSAGE);
		}
		else
		{
			if(first==1)
			{
				setLabels();
				first=0;
			}
			else
			{
				i--;
				if(i<0)
				{
					i=spots.size()-1;
					this.setLabels();
				}
				else
				{
					this.setLabels();
				}	
		
			}
		}
	}
	
	public void setLabels()
	{
		SimpleDateFormat sdf; 
		
		nome.setText(spots.get(i).getNome());
		numero.setText(String.valueOf(spots.get(i).getNumeroDiSkater()));
		indirizzo.setText(spots.get(i).getIndirizzo());
		zona.setText(spots.get(i).getZona());
		comune.setText(spots.get(i).getComune());
		tipo.setText(spots.get(i).getTipo());
		username.setText(spots.get(i).getUsername());
		sdf=new SimpleDateFormat();
		data.setText(sdf.format(spots.get(i).getData()));
		descrizione.setText(spots.get(i).getDescrizione());
		descrizione.setWrapText(true);
	}
}

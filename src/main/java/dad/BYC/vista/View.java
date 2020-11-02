package dad.BYC.vista;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class View extends GridPane {

	TextField buscarTf,reemplazarTf;
	CheckBox cb1,cb2,cb3,cb4;
	Button buscar,reemplazar,reemplazarTodo,cerrar,ayuda;
	VBox derecha;
	GridPane izquierda, cBDiv;
	
	public View() {
		buscar=new Button("Buscar");
		buscar.setMinWidth(120);
		reemplazar=new Button("Reemplazar");
		reemplazar.setMinWidth(120);
		reemplazarTodo=new Button("Reemplazar Todo");
		reemplazarTodo.setMinWidth(120);
		cerrar=new Button("Cerrar");
		cerrar.setMinWidth(120);
		ayuda=new Button("Ayuda");
		ayuda.setMinWidth(120);
		derecha=new VBox();
		derecha.setSpacing(5);
		derecha.setAlignment(Pos.TOP_RIGHT);
		derecha.getChildren().addAll(buscar,reemplazar,reemplazarTodo,cerrar,ayuda);
		buscarTf=new TextField();
		buscarTf.setPromptText("Buscar...");
		reemplazarTf=new TextField();
		reemplazarTf.setPromptText("Reemplazar...");
		cb1=new CheckBox();
		cb2=new CheckBox();
		cb3=new CheckBox();
		cb4=new CheckBox();
		cBDiv=new GridPane();
		cBDiv.setHgap(5);
		cBDiv.setVgap(5);
		cBDiv.addRow(0,cb1, new Label("Mayúsculas y minúsculas"), cb2, new Label("Buscar Hacia Atrás"));
		cBDiv.addRow(1, cb3, new Label("Expresión regular") ,cb4, new Label("Resaltar Resultados"));
		this.setPadding(new Insets(5));
		this.setHgap(5);
		this.setVgap(5);
		this.setAlignment(Pos.TOP_LEFT);
		this.addRow(0, new Label("Buscar:"),buscarTf,derecha);
		this.addRow(1, new Label("Reemplazar con:"),reemplazarTf);
		this.addRow(2, new Label(""), cBDiv);
		GridPane.setRowSpan(derecha, 3);
		this.addColumn(2);;
		ColumnConstraints [] cols = {
				new ColumnConstraints(),	
				new ColumnConstraints(),
				new ColumnConstraints()
			};
		this.getColumnConstraints().setAll(cols);
		cols[0].setHalignment(HPos.RIGHT);
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);		
		
		

	}
	
}

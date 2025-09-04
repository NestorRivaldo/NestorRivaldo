package pe.edu.upeu.asistenciax;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPid;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AsistenciaxApplication extends Application {

	private ConfigurableApplicationContext configurableApplicationContext;
	private Parent parent;
	public static void main(String[] args) {
		SpringApplication.run(AsistenciaApplication.class, args);
	}

	}
	@Override
	public void init() throws Exception {
		//configurableApplicationContext=
		SpringApplication.run(SysPooApplication.class);
		SpringApplicationBuilder builder = new
				SpringApplicationBuilder(AsistenciaApplication.class);
		builder.application().setWebApplicationType(WebApplicationType.NONE);
		configurableApplicationContext =
				builder.run(getParameters().getRaw().toArray(new String[0]));
		FXMLLoader fxmlLoader = new
				FXMLLoader(getClass().getResource("/fxml/asistencia_gui.fxml"));
		fxmlLoader.setControllerFactory(configurableApplicationContext::getBean);
		parent= fxmlLoader.load();
	}
	@Override
	public void start(Stage stage) throws Exception {
		Screen screen = Screen.getPrimary();
		Rectangle2D bounds = screen.getBounds();
		stage.setScene(new Scene(parent,bounds.getWidth(), bounds.getHeight()-
				80));
		stage.show();
		stage.setTitle("Spring Java-FX");
		stage.show();


		public static void main(String[] args) {
		SpringApplication.run(AsistenciaxApplication.class, args);



	}
	@Override
	public void start(Stage stage) throws Exception {

	}
}

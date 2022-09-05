import model.Android;
import model.Camera;
import model.Editor;
import model.Phone;

public class AppLaunch {

	public static void main(String[] args) {
		Android android = new Android();
		
		Camera camera = new Camera();
		Phone phone = new Phone();
		Editor editor = new Editor();
		
		android.install(camera);
		android.install(phone);
		android.install(editor);
		
		
	}

}

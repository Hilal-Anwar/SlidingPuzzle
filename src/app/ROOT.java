package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
public  class ROOT extends Application {
    static String GameStatus="";
    private final Button NewGame = new Button("NEW GAME");
    private final Button Sound = new Button("     SOUND    ");
    private final Button Setting = new Button("    SITTING   ");
    static AnchorPane anchorPane = new AnchorPane();
    static Scene scene = new Scene(anchorPane, 300, 400);
    static Stage stage;
    static Media media=new Media(ROOT.class.getResource("BackgroundSound.mp3").toString());
    static MediaPlayer GameSound=new MediaPlayer(media);
    static Image GameIcon=new Image(ROOT.class.getResource("icon.png").toString());
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GameSound.setAutoPlay(true);
        PuzzleStructure BoardMaker = new PuzzleStructure();
        primaryStage.setTitle("Sliding Puzzle");
        Choose game = new Choose();
        Image imagine = new Image(getClass().getResource("BackImg.jpg").toString(), true);
        ImageView pic = new ImageView(imagine);
        pic.setFitHeight(400);
        pic.setFitWidth(300);
        anchorPane.setStyle("-fx-font: normal bold 30px 'Jokerman'");
        anchorPane.getChildren().add(pic);
        NewGame.setLayoutX(40);
        NewGame.setLayoutY(100);
        NewGame.setId("new");
        Sound.setLayoutX(40);
        Sound.setLayoutY(180);
        Sound.setId("sound");
        Setting.setLayoutX(40);
        Setting.setLayoutY(260);
        Setting.setId("setting");
        NewGame.setOnAction(actionEvent -> {
            GameSound.stop();
            primaryStage.close();
            BoardMaker.create();
        });
        Setting.setOnAction(actionEvent -> game.setting());
        Choose.ThreeXThree.setSelected(true);
        anchorPane.getChildren().add(NewGame);
        anchorPane.getChildren().add(Sound);
        anchorPane.getChildren().add(Setting);
        scene.getStylesheets().add(
                getClass().getResource("puzzle.css").toExternalForm());
        primaryStage.setScene(scene);
        stage = primaryStage;
        BoardMaker.Easy();
        BoardMaker.Medium();
        BoardMaker.Hard();
        primaryStage.getIcons().add(GameIcon);
        primaryStage.show();
    }
}

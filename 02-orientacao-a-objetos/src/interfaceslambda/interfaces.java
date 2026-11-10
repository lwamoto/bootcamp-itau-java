package interfaceslambda;

public class interfaces {

    public static void main(String[] args) {

        //var music = MusicPlayer.music;

        var music = new MusicPlayer() {
            @Override
            public void playMusic() {

            }

            @Override
            public void pauseMusic() {

            }

            @Override
            public void stopMusic() {

            }
        };

    }
}

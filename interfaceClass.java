C


/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 */ 


interface media{
    void play();
    void pause();
    void next();
    void previous();
    String nowPlaying();


}

interface DigitalMedia extends media{
    double size();
    double remaining(double current);
}

interface onlineAssets{
    void download();
}
class Spotify 
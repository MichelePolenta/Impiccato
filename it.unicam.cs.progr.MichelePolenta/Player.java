import java.net.*;

import javax.imageio.ImageIO;
public class Player{
    private static int tentativi;
    Player(int tentativi){
        this.tentativi=tentativi;
    }
    static public boolean inserisciLettera(String playerWord, String word){
        if(playerWord.length()==word.length())
            if(stessaParola(playerWord, word)) return true;
            else return false;
        if(playerWord.length()==1){
            if(unalettera(playerWord, word)) return true;
            else return false;
        }
        if((playerWord.length()>1)&(playerWord.length()<word.length())){
            if(piùLettere(playerWord, word)) return true;
            else return false;
        }
        return false;
    }
    static public int getTentativi(){
        return tentativi;
    }
    static public boolean stessaParola(String playerWord , String word){   
            if(playerWord==word)return true;
            if(playerWord.length()==1) return unalettera(playerWord, word);
            else{ 
                tentativi=0;
                return false;
            }
    } 
    static public boolean unalettera(String playerWord, String word){
        if(playerWord != " "){
        for(int i=0;i<word.length();i++)
            if(playerWord.charAt(0) == word.charAt(i)) return true;
        }
        else { 
            tentativi--;
            return false;
        }
        tentativi--;
        return false;
    }
    static public boolean piùLettere (String playerWord, String word){
        int check=0;
            for(int i=0;i<word.length();i++)
                for(int j=0;j<playerWord.length();j++){
                    if(playerWord.charAt(j) != word.charAt(i)) check++;
                }
        if(check==0) return true;
        else{
            tentativi=tentativi -check;
            return false;
        }
    }
}

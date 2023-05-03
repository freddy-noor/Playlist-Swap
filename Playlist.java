import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Into the sun - Sons Of The East"); 
    desertIslandPlaylist.add("Magnetized -  Tom Odell");
    desertIslandPlaylist.add("Hello - Adele");
    desertIslandPlaylist.add("Mr. Brightside - The Killers");
    desertIslandPlaylist.add("Hallelujah - Leonard Cohen");
    desertIslandPlaylist.add("Loves run out - One Republic");
    desertIslandPlaylist.remove(5);
    //System.out.println(desertIslandPlaylist.size());

    int a = desertIslandPlaylist.indexOf("Hello - Adele");
    int b = desertIslandPlaylist.indexOf("Hallelujah - Leonard Cohen");
    //System.out.println(a);

    String tempA = "Hello - Adele";
    desertIslandPlaylist.set(a, "Hallelujah - Leonard Cohen");
    System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(b, tempA);
    System.out.println(desertIslandPlaylist);
  }
  
}

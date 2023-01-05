package Ch8Classes;

public class Valorant {
    //fields
    private String ign,email,phoneNumber,creditcardNumber;
    private int wins,loses,kills,deaths,headshots,bodyshots,legshots;
    private double kd;


    //constructors
    public Valorant(int wins,int loses,int kills,int deaths,int headshots,int bodyshots,int legshots,String ign,String email,String phoneNumber,String creditcardNumber){
        this.wins = wins;
        this.loses = loses;
        this.kills = kills;
        this.deaths = deaths;
        this.headshots = headshots;
        this.bodyshots = bodyshots;
        this.legshots = legshots;
        this.ign = ign;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.creditcardNumber = creditcardNumber;
    }
    public Valorant(int wins,int loses,int kills,int deaths,int headshots,int bodyshots,int legshots,String ign,String email,String phoneNumber){
        this( wins, loses, kills, deaths, headshots, bodyshots, legshots, ign, email, phoneNumber,null);
    }

    //getters
    public String getCreditcardNumber(){
        return creditcardNumber;
    }
    public int getWins(){
        return wins;
    }
    public int getLoses(){
        return loses;
    }
    public int getKills(){
        return kills;
    }
    public int getDeaths(){
        return deaths;
    }
    public int getHeadshots(){
        return headshots;
    }
    public int getBodyshots(){
        return bodyshots;
    }
    public int getLegshots(){
        return legshots;
    }

    //setters
    public void setIgn(){
        this.ign = ign;
    }
    public void setEmail(){
        this.email = email;
    }
    public void setPhoneNumber(){
        this.phoneNumber = phoneNumber;
    }
    public void setKd(){
        kd = (kills / deaths);
    }

    //toString
    public String toString() {
        return "IGN: " + ign + "\n" +
                "Email: " + email + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Wins: " + wins + "\n" +
                "Loses: " + loses + "\n" +
                "Kills: " + kills + "\n" +
                "Deaths: " + deaths + "\n" +
                "K/D: " + kd + "\n" +
                "Headshots: " + headshots + "\n" +
                "Legshots: " + legshots + "\n" +
                "Bodyshots: " + bodyshots + "\n";
    }
}


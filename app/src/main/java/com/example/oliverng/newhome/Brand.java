package com.example.oliverng.newhome;

public class Brand {

    String brandName;
    String location;
    String background;
    int rating;
    int likes;
    int saves;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getBackgroundId(){
        String background = getBackground();

        if(background.equals("aa")){
            return R.mipmap.aa;
        }else if(background.equals("bb")){
            return R.mipmap.bb;
        }else if(background.equals("cc")) {
            return R.mipmap.cc;
        }else if(background.equals("dd")){
            return R.mipmap.dd;
        }else if(background.equals("ee")) {
            return R.mipmap.ee;
        }else if(background.equals("ff")){
            return R.mipmap.ff;
        }else if(background.equals("gg")){
            return R.mipmap.gg;
        }else if(background.equals("hh")){
            return R.mipmap.hh;
        }else if(background.equals("ii")){
            return R.mipmap.ii;
        }else if(background.equals("jj")){
            return R.mipmap.jj;
        }else if(background.equals("kk")){
            return R.mipmap.kk;
        }else{
            return R.mipmap.aa;
        }
    }

    public int getRatingIconId(){
        int rating = getRating();

        if(rating == 0){return R.mipmap.rating0;}
        else if(rating == 1){return R.mipmap.rating1;}
        else if(rating == 2){return R.mipmap.rating2;}
        else if(rating == 3){return R.mipmap.rating3;}
        else if(rating == 4){return R.mipmap.rating4;}
        else if(rating == 5){return R.mipmap.rating5;}
        else if(rating == 6){return R.mipmap.rating6;}
        else if(rating == 7){return R.mipmap.rating7;}
        else if(rating == 8){return R.mipmap.rating8;}
        else if(rating == 9){return R.mipmap.rating9;}
        else if(rating == 10){return R.mipmap.rating10;}
        else{return R.mipmap.ratingnr;}
    }
}

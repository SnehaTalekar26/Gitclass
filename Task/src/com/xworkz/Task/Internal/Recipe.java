package com.xworkz.Task.Internal;

public class Recipe {
    private String dishName;
    private int prepTime;
    private int servings;

    public Recipe(String dishName, int prepTime, int servings){
        this.dishName = dishName;
        this.prepTime = prepTime;
        this.servings = servings;
    }

    @Override
    public String toString(){
        return " Recipe dish: " + this.dishName + " ,Prep Time: " + this.prepTime + " mins ,Servings: " + this.servings;
    }
    @Override
    public int hashCode(){
        return 261;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Recipe){
            Recipe recipe1=this;
            Recipe recipe2=(Recipe) obj;
            if(recipe1.dishName==recipe1.dishName && recipe2.prepTime==recipe2.prepTime){
                return true;
            }
        }
        return false;
    }
}

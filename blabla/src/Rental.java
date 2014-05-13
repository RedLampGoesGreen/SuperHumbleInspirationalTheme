class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
    double getCharge() {
        return movie.getCharge(daysRented);
    }

   public double getFrequentRenterPoints(){
       int frequentRenterPoints=0;
       if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDaysRented() > 1)
           frequentRenterPoints ++;
       frequentRenterPoints++;
       return frequentRenterPoints;
   }

}
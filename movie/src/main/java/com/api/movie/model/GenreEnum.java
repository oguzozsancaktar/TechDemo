package com.api.movie.model;


public enum GenreEnum {

    Action(28),
    Adventure(12),
    Animation(16),
    Comedy(35),
    Crime(80),
    Documentary(99),
    Drama(18),
    Family(10751),
    Fantasy(14),
    History(36),
    Horror(27),
    Music(10402),
    Mystery(9648),
    Romance(10749),
    ScienceFiction(878),
    TVMovie(10770),
    Thriller(53),
    War(10752),
    Western(37);

    public final int id;

    private GenreEnum(int id) {
        this.id = id;
    }

    public static GenreEnum getById(int id){
        for (GenreEnum e : values()) {
            if (e.id == id) {
                return e;
            }
        }
        return null;
    }

}

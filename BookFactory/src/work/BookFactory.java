package work;

public class BookFactory {

    public Genre getMeal(GenreType genreType){
        switch (genreType){
            case FICTION: return new Fiction();
            case GRAPHIC_NOVEL: return new GraphicNovel();
            case BIOGRAPHY: return new Biography();
            default: return null;
        }


    }
}

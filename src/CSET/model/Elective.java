package CSET.model;

/**
 * Created by Matt on 3/9/2017.
 */
public class Elective  extends Course {
    private Boolean isMultiCulturalElective;

    public Elective(String year, String type, int sectionNumber, int creditHours, Boolean isMultiCulturalElective) {
        super(year, type, sectionNumber, creditHours);
        this.isMultiCulturalElective = isMultiCulturalElective;
    }

    public Boolean getMultiCulturalElective() {
        return isMultiCulturalElective;
    }

    public void setMultiCulturalElective(Boolean multiCulturalElective) {
        isMultiCulturalElective = multiCulturalElective;
    }
}

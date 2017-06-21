package byaj;

/**
 * Created by student on 6/20/17.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Classmate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@NotNull
    //@Min(1)
    private int mateID;
    @NotNull
    @Size(min=2, max=30)
    private String mateFirstName;
    @NotNull
    @Size(min=2, max=30)
    private String mateLastName;
    @NotNull
    @Size(min=2, max=30)
    private String mateFood;

    public int getMateID() {
        return mateID;
    }

    /*public void setMateID(int mateID) {
        this.mateID = mateID;
    }*/
    public String getMateFirstName() {
        return mateFirstName;
    }

    public String getMateLastName() {
        return mateLastName;
    }

    public String getMateFood() {
        return mateFood;
    }

    public void setMateFirstName (String mateFirstName) {
        this.mateFirstName = mateFirstName;
    }

    public void setMateLastName (String mateLastName) {
        this.mateLastName = mateLastName;
    }

    public void setMateFood (String mateFood) {
        this.mateFood = mateFood;
    }
}
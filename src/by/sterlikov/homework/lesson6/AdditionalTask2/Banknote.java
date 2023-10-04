package by.sterlikov.homework.lesson6.AdditionalTask2;

import java.util.Objects;

public class Banknote {
    private String country;
    private int denomination;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public Banknote() {
    }

    public Banknote(String country, int denomination) {
        this.country = country;
        this.denomination = denomination;
    }

    @Override
    public String toString() {
        return "Banknote{" +
                "country='" + country + '\'' +
                ", denomination=" + denomination +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Banknote banknote = (Banknote) o;

        if (denomination != banknote.denomination) return false;
        return Objects.equals(country, banknote.country);
    }

    @Override
    public int hashCode() {
        int result = country != null ? country.hashCode() : 0;
        result = 31 * result + denomination;
        return result;
    }
}

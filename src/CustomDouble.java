public class CustomDouble {
    public int anInt;
    public double aDouble;

    public CustomDouble() {
        anInt = 0;
        aDouble = 0;
    }

    public CustomDouble(int anInt, double aDouble) {
        this.anInt = anInt;
        if (aDouble >= 1) {
            if (this.anInt < 0)
                this.anInt -= Math.abs(aDouble / 1);
            else
                this.anInt += Math.abs(aDouble / 1);
            this.aDouble += Math.abs(aDouble % 1);

        } else
            this.aDouble = aDouble;
    }

    public double toDouble() {
        if (this.anInt < 0)
            return this.anInt - this.aDouble;
        else
            return this.anInt + this.aDouble;
    }

    public void plus(final CustomDouble obj) {
        double result = this.toDouble();
        double tmp = obj.toDouble();
        result += tmp;
        this.anInt = (int) result;
        this.aDouble = Math.abs(result - this.anInt);
    }

    public void minus(final CustomDouble obj) {
        double result = this.toDouble();
        double tmp = obj.toDouble();
        result -= tmp;
        this.anInt = (int) result;
        this.aDouble = Math.abs(result - this.anInt);
    }

    public boolean moreThan(final CustomDouble obj) {
        return (this.toDouble() > obj.toDouble());
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        final CustomDouble object = (CustomDouble) obj;
        return this.anInt == object.anInt && this.aDouble == object.aDouble;
    }

    public boolean moreEqualThan(final CustomDouble obj) {
        return this.moreThan(obj) | this.equals(obj);
    }

    public boolean lessThan(final CustomDouble obj) {
        return !this.moreThan(obj) && !this.equals(obj);
    }

    public boolean lessEqualThan(final CustomDouble obj) {
        return this.lessThan(obj) | this.equals(obj);
    }

    @Override
    public int hashCode() {
        return this.anInt + (int) (10000 * this.aDouble) + 27;
    }

    public void sout() {
        System.out.println(this.toDouble());
    }
}
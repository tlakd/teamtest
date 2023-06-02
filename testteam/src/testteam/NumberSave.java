package testteam;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NumberSave implements Comparable<NumberSave> {
	List<Integer> NumberList = new ArrayList<>();
	int number;

	public NumberSave(int value) {
		this.number = value;
	}

	   public int getNumber() {
	        return number;
	    }

	@Override
	public String toString() {
		return number + "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumberSave other = (NumberSave) obj;
		return number == other.number;
	}

	@Override
	public int compareTo(NumberSave o) {
		return Integer.compare(this.number, o.number);
	}

}

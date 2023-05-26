package testteam;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NumberSave implements Comparable<NumberSave> {
	List<Integer> NumberList = new ArrayList<>();
	int Number;

	public NumberSave(int value) {
		this.Number = value;
	}

	@Override
	public String toString() {
		return Number + "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Number);
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
		return Number == other.Number;
	}

	@Override
	public int compareTo(NumberSave o) {
		return Integer.compare(this.Number, o.Number);
	}

}

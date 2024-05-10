package getlandestate.pojos;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class LogController{
	private boolean last;
	private int totalPages;

	private int totalElements;

	public LogController() {
	}

	public LogController(boolean last, int totalPages, int totalElements) {
		this.last = last;
		this.totalPages = totalPages;
		this.totalElements = totalElements;
	}

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	@Override
	public String toString() {
		return "LogController{" +
				"last=" + last +
				", totalPages=" + totalPages +
				", totalElements=" + totalElements +
				'}';
	}
}

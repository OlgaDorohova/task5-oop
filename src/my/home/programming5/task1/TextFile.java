package my.home.programming5.task1;

import java.util.Objects;

public class TextFile extends File {
	private StringBuffer textData = new StringBuffer();

	public TextFile() {
	}

	public TextFile(String fileName) {
		super(fileName);

	}

	public TextFile(String fileName, Directory directory) {
		super(fileName, directory);
		directory.addFile(this);
	}

	public Directory getDirectory() {
		return directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

	public void setTextData(String string) {
		textData = new StringBuffer(string);
	}

	public StringBuffer getTextData() {
		return textData;
	}

	public void addTextData(String string) {
		textData.append(string);
	}

	@Override
	public int hashCode() {
		return Objects.hash(directory, getFileName());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		return directory.equals(other.directory) && Objects.equals(getFileName(), other.getFileName());
	}

	@Override
	public String toString() {
		return "TextFile [fileName=" + getFileName() + ", directory=" + directory + ", textData=" + textData + "]";
	}

}

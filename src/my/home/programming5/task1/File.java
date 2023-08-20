package my.home.programming5.task1;

import java.util.Objects;

public class File {
	private String fileName;
	public Directory directory;

	public File() {
	}

	public File(String fileName) {
		this.fileName = fileName;
	}

	public File(String fileName, Directory directory) {
		this.fileName = fileName;
		this.directory = directory;
		directory.addFile(this);
	}

	public void setFileName(String name) {
		fileName = name;
	}

	public String getFileName() {
		return fileName;
	}

	public Directory getDirectory() {
		return directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

	@Override
	public int hashCode() {
		return Objects.hash(directory, fileName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		File other = (File) obj;
		return Objects.equals(directory, other.directory) && Objects.equals(fileName, other.fileName);
	}

	@Override
	public String toString() {
		return "File[" + "name: " + fileName + ", directiry: " + directory + "]";
	}

}

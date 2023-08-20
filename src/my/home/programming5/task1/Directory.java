package my.home.programming5.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {
	private String dirName;
	private List<File> fileList;
	private List<Directory> directoryList;

	public Directory() {

	}

	public Directory(String dirName) {
		this.dirName = dirName;
		fileList = new ArrayList<>();
		directoryList = new ArrayList<>();
	}

	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	public String getDirName() {
		return dirName;
	}

	public void addFile(File file) {
		for (File f : fileList) {
			if (f.equals(file)) {
				System.out.println("File has already added. " + file.getFileName());
				return;
			}
		}

		fileList.add(file);
		file.setDirectory(this);
	}

	public void addDirectory(Directory directory) {
		directoryList.add(directory);
	}

	public List<Directory> getDirList() {
		return directoryList;
	}

	public List<File> getFileList() {
		return fileList;
	}

	public void renameFile(File file, String newName) {
		if (!fileList.contains(file)) {
			System.out.println(file.getFileName() + " not find");
			return;
		}

		for (File f : fileList) {
			if (f.getFileName().equals(newName)) {
				System.out.println("file name has already used. " + f.getFileName());
				return;
			}
		}

		file.setFileName(newName);
	}

	public List<File> deleteFile(File file) {
		if (fileList.isEmpty()) {
			return fileList;
		}

		for (int i = 0; i < fileList.size(); i++) {
			if (fileList.get(i).equals(file)) {
				fileList.remove(i);
			}
		}

		return fileList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dirName, directoryList, fileList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		return Objects.equals(dirName, other.dirName) && Objects.equals(directoryList, other.directoryList)
				&& Objects.equals(fileList, other.fileList);
	}

	@Override
	public String toString() {
		return "Directory [dirName=" + dirName + ", fileList=" + fileList + ", directoryList=" + directoryList + "]";
	}

}

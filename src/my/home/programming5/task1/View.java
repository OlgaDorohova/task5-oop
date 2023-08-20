package my.home.programming5.task1;

import java.util.List;

public class View {

	public void showDirectoriesTree(Directory directory) {
		List<Directory> tempDirectories = directory.getDirList();
		System.out.print(directory.getDirName());
		for (Directory dir : tempDirectories) {
			System.out.print("/" + dir.getDirName());
		}

		System.out.println();
	}

	public void showFiles(Directory directory) {
		List<? extends File> tempFileList = directory.getFileList();
		System.out.println(directory.getDirName() + ":");
		for (int i = 0; i < tempFileList.size(); i++) {
			System.out.println(tempFileList.get(i).getFileName());
		}
	}

	public void showText(TextFile file) {
		System.out.println(file.getTextData());
	}

}

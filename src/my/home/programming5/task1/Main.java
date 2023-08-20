package my.home.programming5.task1;

/*
Создать объект класса Текстовый файл, используя классы Файл, Директория. 
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Directory dir1 = new Directory("Dir1");
		Directory dir2 = new Directory("Dir2");
		Directory dir3 = new Directory("Dir3");
		Directory dir4 = new Directory("Dir4");

		File file1 = new File("1", dir1);
		File file2 = new File("2", dir1);
		File file3 = new File("3", dir1);
		File file4 = new File("4");

		TextFile textFile = new TextFile("Text");
		String text = "Hello, guies!";
		textFile.addTextData(text);
		textFile.addTextData("How are you today?");

		dir1.addDirectory(dir2);
		dir1.addDirectory(dir4);

		dir2.addDirectory(dir3);

		View view = new View();

		view.showDirectoriesTree(dir1);

		dir1.addFile(file1);
		dir1.addFile(file4);

		view.showFiles(dir4);
		view.showFiles(dir1);

		dir1.deleteFile(file3);
		view.showFiles(dir1);

		dir2.addFile(textFile);
		view.showFiles(dir2);

		view.showText(textFile);

		dir1.renameFile(file2, "5");
		view.showFiles(dir1);

	}

}

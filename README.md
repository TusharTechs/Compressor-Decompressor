# Compressor Decompressor Project

This project provides a simple Java-based implementation of a file compressor and decompressor. It allows you to compress files using the GZIP compression algorithm and decompress GZIP-compressed files.

## Features

- Compresses files using GZIP compression.
- Decompresses GZIP-compressed files.
- Provides a graphical user interface (GUI) for easy file selection and compression/decompression.

## Screenshots
- The Application-User Interface.
![Screenshot_2](https://github.com/TusharTechs/Compressor-Decompressor/assets/56952465/427cb7b9-59ab-4508-81d5-ef63200ef3af)

-Selecting a file to compress.
![Screenshot_3](https://github.com/TusharTechs/Compressor-Decompressor/assets/56952465/138ebae3-2097-4492-b317-c3606baa258e)

-File compression.
![Screenshot_4](https://github.com/TusharTechs/Compressor-Decompressor/assets/56952465/0fc2b017-f177-4f92-a7d7-37ae2a0a5f14)

-Compressed file gets saved in same folder.
![Screenshot_5](https://github.com/TusharTechs/Compressor-Decompressor/assets/56952465/a2612055-158b-4bab-b8f0-422519ef5a74)







## Requirements

- Java Development Kit (JDK) 8 or higher.
- IntelliJ IDEA (or any Java IDE of your choice) for running the project.

## Usage

1. Clone or download the project to your local machine.
2. Open the project in IntelliJ IDEA (or your preferred Java IDE).
3. Build the project to ensure all dependencies are resolved.
4. Run the project by executing the `GUI.Main` class.
5. The application's GUI will open, displaying two buttons: "Select file to compress" and "Select file to decompress".
6. To compress a file, click the "Select file to compress" button and choose a file from the file chooser dialog. The compressed file will be saved with the ".gz" extension in the same location as the original file.
7. To decompress a file, click the "Select file to decompress" button and choose a GZIP-compressed file (.gz) from the file chooser dialog. The decompressed file will be saved in the same location as the original file.

## Contributing

Contributions to this project are welcome. If you have any suggestions, improvements, or bug fixes, feel free to submit a pull request or open an issue.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

- The GZIP compression and decompression functionality in this project is based on the Java standard library classes `GZIPOutputStream` and `GZIPInputStream`.
- The project structure and GUI implementation were inspired by various Java programming resources and tutorials.

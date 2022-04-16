package com.te.learn.Assessment.musicplayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Home {

	public static void searchSong(String songName, ArrayList<MusicFiles> list) {
		boolean result = false;
		for (MusicFiles file : list) {
			if (file.getSongTitle().contains(songName)) {
				System.out.println(file.toString());
				result = true;
			}
		}
		System.out.print(result ? "" : "There is no songs in that name\n");
	}

	public static void showAllSongs(ArrayList<MusicFiles> list) {
		Comparator<MusicFiles> comparator = Comparator.comparing(MusicFiles::getSongTitle);
		Collections.sort(list, comparator);
		System.out.println("Song_Id  |   Song_Title    |     Artist_Name    |       Album_Name    |   Song_Location   |  Decription");
		System.out.println();
		for (MusicFiles musicFiles : list) {

			System.out.format("%4d %20s %20s %20s %20s %10s", musicFiles.getSongId(), musicFiles.getSongTitle(),
					musicFiles.getArtistName(), musicFiles.getAlbumName(), musicFiles.getSongLocation(),
					musicFiles.getDescription());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		boolean exit = false;
		// createPlayList();
		PlaySongs playSongs = new PlaySongs();
		EditSongs editSongs = new EditSongs();
		ArrayList<MusicFiles> list = new ArrayList<MusicFiles>();
		list.add(new MusicFiles(01, "Yathe Yathe", "G.V.Prakash", "Aadukalam", "Melody songs", "song"));
		list.add(new MusicFiles(02, "Venmegam", "Yuvan Shankar Raja", "Yaaradi Nee Mohini", "Melody songs", "song"));
		list.add(new MusicFiles(03, "Kani Mozhiyae", "Harris Jayaraj", "Irandam Ulagam", "Melody songs", "song"));
		list.add(new MusicFiles(04, "Yennodu Vaa Vaa", "Ilaiyaraaja", "NYP", "Melody songs", "song"));
		list.add(new MusicFiles(05, "Nallai Allai", "A.R.Rahman", "Kaatru Veliyidai", "Melody songs", "song"));
		Scanner scanner = new Scanner(System.in);
		int size = list.size();
		do {
			System.out.println("\n============Music Player============\n\n" + "1. Press 1 to 'Play a Song'"
					+ "\n2. Press 2 to 'Search a Song' " + "\n3. Press 3 to 'Show all Songs'"
					+ "\n4. Press 4 to 'Operate on Songs Database" + "\n5. Press 5 to 'Exit' ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Press A to “Play all songs”\n" + "Press B to “Play Songs Randomly”\n"
						+ "Press C to “Play a Particular Song”");
				String choice1 = scanner.next();
				switch (choice1) {
				case "A": {
					try {
						playSongs.playAllSongs(list);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
				case "B": {
					try {
						playSongs.playSongsRandomly(list);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
				case "C": {

					try {
						playSongs.playParticularSong(list);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					break;
				}
				default: {
					break;
				}
				}
				break;
			}
			case 2: {
				System.out.println("Enter the Song name to search:");
				scanner.nextLine();
				String searchSongName = scanner.nextLine();
				searchSong(searchSongName, list);
				break;
			}
			case 3: {
				showAllSongs(list);
				break;
			}
			case 4: {
				System.out.println("Press A to “Add Song” to Songs Repository\n"
						+ "Press B to “Edit an existing Song” info\n" + "Press C to “Delete an existing Song” info\n");
				String choice1 = scanner.next();
				switch (choice1) {
				case "A": {
					size+=1;
					editSongs.addSong(list,size);
					break;
				}
				case "B": {
					editSongs.editExistingSong(list);
					break;
				}
				case "C": {
					editSongs.deleteExistingSong(list);
					break;
				}
				default: {
					break;
				}
				}
				break;
			}
			case 5: {
				exit = true;
				break;
			}

			}
		} while (!exit);
	}

	public static void createPlayList() {
		MusicFiles[] musicFiles = null;
		musicFiles[0] = new MusicFiles(01, "Yathe Yathe", "G.V.Prakash", "Aadukalam", "Melody songs", "Love song");
		musicFiles[1] = new MusicFiles(01, "Venmegam", "Yuvan Shankar Raja", "Yaaradi Nee Mohini", "Melody songs",
				"Love song");
		musicFiles[2] = new MusicFiles(01, "Kani Mozhiyae", "Harris Jayaraj", "Irandam Ulagam", "Melody songs",
				"Love song");
		musicFiles[3] = new MusicFiles(01, "Yennodu Vaa Vaa", "Ilaiyaraaja", "Neethaney en Ponvasantham",
				"Melody songs", "Love song");
		musicFiles[4] = new MusicFiles(01, "Nallai Allai", "A.R.Rahman", "Kaatru Veliyidai", "Melody songs",
				"Love song");

	}

}

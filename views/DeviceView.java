package views;

import controllers.DeviceControllers;
import utils.CLIUtils;

class InvalidMenuException extends Exception {

    public InvalidMenuException(int menu) {
        super("Salah Menu : " + menu);
    }
}

public class DeviceView {

    private DeviceControllers deviceControllers;

    public void render() {
        this.printMenu();
        int menu = CLIUtils.getInt();
        while (menu != 0) {
            try {
                if (menu < 0) {
                    throw new InvalidMenuException(menu);
                }
                if (menu > 3) {
                    throw new InvalidMenuException(menu);
                }
                if (menu == 1) {
                    this.handleTambahDevice();
                }
                if (menu == 2) {
                    this.handlePrintDevice();
                }
                if (menu == 3) {
                    this.handleSortDevice();
                }
            } catch (InvalidMenuException e) {
                System.out.println(e.getMessage());
            }
            this.printMenu();
            menu = CLIUtils.getInt();
        }
    }

    private void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah device");
        System.out.println("2. Tampilkan semua device");
        System.out.println("3. Tampilkan semua device terurut berdasarkan OS");
        System.out.println("0. Keluar");
    }

    private void handleTambahDevice() {

    }

    private void handlePrintDevice() {

    }

    private void handleSortDevice() {

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;
import javax.swing.table.*;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Ainan
 */

//membuat class MyTableModel yang mewarisi abstracttablemodel 
//untuk membuat model tabel

public class MyTabelModel extends AbstractTableModel{
    // menyiapkan columnName untuk menyimpan data 
    private String[] columnNames = {"Nama", "Telepon", "Jenis Kelamin", "Alamat"};
    //Membuat arraylist dengan nama data yang berisi arraylist dengan tipe string
    // untuk menyimpan data dari input
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
    
    //fungsi untuk menambah jumlah kolom
    public int getColumnCount() {
        return columnNames.length;
    }
    
    //fungsi untuk menambah baris
    public int getRowCount() {
        return data.size();
    }
    
    // fungsi untuk mendapatkan nama dari kolom yang dipilih dari parameter
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    // fungsi untuk mendapatkan nilai dari baris dan kolom tertentu
    public Object getValueAt(int row, int col) {
        List<String> rowItem = data.get(row);
        return rowItem.get(col);
    }
    
    //fungsi untuk mengatur apakah cell bisa di edit atau tidak
    public boolean isCellEditable(int row, int col) {
        return false;
    }
    
    // method untuk menambah nilai ke tabel
    public void add(ArrayList<String> value) {
        data.add(value);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }
}


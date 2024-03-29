/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Erfan040523.model;
import java.util.List;
/**
 *
 * @author Erfan
 */
public interface BukuDao {
    void save(Buku buku);
    void update(int idx, Buku buku);
    void delete(int idx);
    Buku getBuku(int idx);
    List<Buku> getAll();
}

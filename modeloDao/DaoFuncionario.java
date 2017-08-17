package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansFuncionario;
import modeloConnection.DBCon;

public class DaoFuncionario {
    
    DBCon conex = new DBCon();
    
    public void cadastrar(BeansFuncionario mod){
        conex.conexao();
        PreparedStatement pst;
        try {
            pst = conex.con.prepareStatement("INSERT INTO funcionarios (nome, admissao, cargo, salario, limVale, rg, fone1, fone2, endereco, numero, complemento, "
                    + "limNotas, limCheques, credito) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getData());
            pst.setString(3, mod.getCargo());
            pst.setDouble(4, mod.getSalario());
            pst.setDouble(5, mod.getLimVales());
            pst.setString(6, mod.getRg());
            pst.setString(7, mod.getFone1());
            pst.setString(8, mod.getFone2());
            pst.setString(9, mod.getEndereco());
            pst.setInt(10, mod.getNumero());
            pst.setString(11, mod.getComplemento());
            pst.setDouble(12, mod.getLimNotas());
            pst.setDouble(13, mod.getLimCheques());
            pst.setDouble(14, mod.getCredito());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário.\n"+ex);
        }
        conex.desconectar();
    }
}

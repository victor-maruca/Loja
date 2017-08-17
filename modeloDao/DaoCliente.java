package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansCliente;
import modeloConnection.DBCon;

    

public class DaoCliente {
    
    DBCon conex = new DBCon();
    
    public void cadastrar(BeansCliente mod){
        conex.conexao();
        PreparedStatement pst;
        try {
            if(mod.getData().isEmpty()){
                pst = conex.con.prepareStatement("INSERT INTO clientes (nome, nascimento, rg, cpf, endereco, numero, bairro, cidade, UF, cep, "
                    + "complemento, celPessoal, fonePessoal, foneComercial, limiteNotas, limiteCheques, credito) VALUES (?,NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, mod.getNome());
                pst.setString(2, mod.getRG());
                pst.setString(3, mod.getCPF());
                pst.setString(4, mod.getEndereco());
                pst.setInt(5, mod.getNumero());
                pst.setString(6, mod.getBairro());
                pst.setString(7, mod.getCidade());
                pst.setString(8, mod.getUf());
                pst.setString(9, mod.getCEP());
                pst.setString(10, mod.getComplemento());
                pst.setString(11, mod.getCelPessoal());
                pst.setString(12, mod.getFonePessoal());
                pst.setString(13, mod.getFoneComercial());
                pst.setDouble(14, mod.getLimiteNotas());
                pst.setDouble(15, mod.getLimiteCheques());
                pst.setDouble(16, mod.getCredito());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            }else{
                pst = conex.con.prepareStatement("INSERT INTO clientes (nome, nascimento, rg, cpf, endereco, numero, bairro, cidade, UF, cep, "
                    + "complemento, celPessoal, fonePessoal, foneComercial, limiteNotas, limiteCheques, credito) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, mod.getNome());
                pst.setString(2, mod.getData());
                pst.setString(3, mod.getRG());
                pst.setString(4, mod.getCPF());
                pst.setString(5, mod.getEndereco());
                pst.setInt(6, mod.getNumero());
                pst.setString(7, mod.getBairro());
                pst.setString(8, mod.getCidade());
                pst.setString(9, mod.getUf());
                pst.setString(10, mod.getCEP());
                pst.setString(11, mod.getComplemento());
                pst.setString(12, mod.getCelPessoal());
                pst.setString(13, mod.getFonePessoal());
                pst.setString(14, mod.getFoneComercial());
                pst.setDouble(15, mod.getLimiteNotas());
                pst.setDouble(16, mod.getLimiteCheques());
                pst.setDouble(17, mod.getCredito());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente.\n"+ex);
        }
        conex.desconectar();
    }
    
}

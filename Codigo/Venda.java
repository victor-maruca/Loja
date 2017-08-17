package Codigo;

import java.sql.SQLException;
import modeloBeans.BeansPgto;
import modeloBeans.BeansVenda;
import modeloConnection.DBCon;
import modeloDao.DaoVenda;

public class Venda {
    
    DaoVenda dao = new DaoVenda();
    DBCon conex = new DBCon();
    
    
    public int start(){
        int sellNum=0;
        conex.conexao();
        conex.executaSql("SELECT * FROM lastsell");
        try{
            conex.rs.first();
            sellNum=conex.rs.getInt("lastSell")+1;
            conex.executaUpdate("TRUNCATE TABLE lastsell");
            conex.executaUpdate("INSERT INTO lastsell (lastSell) VALUES ("+sellNum+")");
        }catch(SQLException e){}
        conex.desconectar();
        return sellNum;
    }
    
    public boolean add(BeansVenda item){
        //PRECISA DA VALIDAÇÃO DO SAT!
        dao.inserir(item);
        return true;
    }
    
    public boolean remove(int id){
        //PRECISA DA VALIDAÇÃO DO SAT!
        dao.remover(id);
        return true;
    }
    
    public boolean cancel(int num){
        //PRECISA DA VALIDAÇÃO DO SAT!
        dao.cancel(num);
        return true;
    }
    
    public boolean finish(BeansPgto mod){
        //PROVAVELMENTE PRECISA DA VALIDAÇÃO DO SAT!
        dao.finalizar(mod);
        return true;
    }
    
}

package Codigo;

public class Utilitarios {
     
    public boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean isInt(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    public boolean testaCnpj(String cnpj){
        if(isInt(cnpj) && cnpj.length()==14){
            return true;
        }
        
        if(cnpj.length()<18){
            return false;
        }
        
        if(cnpj.charAt(2) == '.' && cnpj.charAt(6) == '.' && cnpj.charAt(10)=='/' && cnpj.charAt(15)=='-'){
            if(isInt(cnpj.substring(0, 2)) && isInt(cnpj.substring(3, 6)) && isInt(cnpj.substring(7, 10)) && isInt(cnpj.substring(11, 15)) && isInt(cnpj.substring(16, 18))){
                return true;
            }
        }
        
        return false;
    }
    
    //----------COM PROBLEMA--------------//
    public boolean testaFone(String fone){  
        if(isInt(fone) && (fone.length() == 10 || fone.length() == 11)){
            return true;
        }
        
        if(fone.length()<15){       
            return false;
        }
        
        if(fone.charAt(0)=='(' && fone.charAt(3)==')' && fone.charAt(fone.length()-4)=='-'){
            if(isInt(fone.substring(2, 4)) && isInt(fone.substring(fone.length()-3, fone.length()+1)) && isInt(fone.substring(6, fone.length()-4))){
                return true;
            }
        }
        return false;
    }
    
    public String formataData(String mod){
        if(mod.length()==2 && isInt(mod) && Integer.parseInt(mod)<=31){
            return mod+"/";
        }else if(mod.length()==5 && isInt(mod.substring(0, 2)) && isInt(mod.substring(3, 5)) && Integer.parseInt(mod.substring(3, 5))<=12){
            return mod+"/";
        }else if(mod.length()>10){
            return mod.substring(0, mod.length()-1);
        }else{
            return mod;
        }
    }
    
    public String formataPreco(String valor){
        if(isDouble(valor)){
            return "R$ " + String.format("%.2f", Double.parseDouble(valor)).replace('.', ',');
        }else{
            return valor;
        }
    }
    
    public String formataRG(String rg){
        if(rg.length()==9 && isInt(rg.substring(0, 8))){
            return rg.substring(0, 2)+"."+rg.substring(2, 5)+"."+rg.substring(5, 8)+"-"+rg.substring(8, 9);
        }else{
            return rg;
        }
    }
    
    public String formataCPF(String cpf){
        if(cpf.length()==11 && isInt(cpf.substring(0,5)) && isInt(cpf.substring(5))){
            return cpf.substring(0, 3)+"."+cpf.substring(3, 6)+"."+cpf.substring(6, 9)+"-"+cpf.substring(9);
        }else{
            return cpf;
        }
    }
    
    public String formataFone(String fone){
        if((fone.length()==11 || fone.length()==10) && isInt(fone.substring(1)) && isInt(""+fone.charAt(0))){
            if(fone.length()==11){
                return "("+fone.substring(0,2)+")"+fone.charAt(2)+" "+fone.substring(3, 7)+"-"+fone.substring(7);
            }else{
                return "("+fone.substring(0,2)+")"+" "+fone.substring(2, 6)+"-"+fone.substring(6);
            }
        }else{
            return fone;
        }
    }
    
    public String formataCEP(String cep){
        if(cep.length()==8 && isInt(cep)){
            return cep.substring(0, 5)+"-"+cep.substring(5);
        }else{
            return cep;
        }
    }

    public boolean isData(String data){
       
        if(data.length()!=10){
            return false;
        }
        if(data.charAt(2)!='/' || data.charAt(5)!='/'){
            return false;
        }
        if(!isInt(data.substring(0, 2)) || !isInt(data.substring(3, 5)) || !isInt(data.substring(6))){
            return false;
        }
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        
        if(dia>31 || mes>12){
            return false;
        }
        if( (mes==2 && dia>29) ||
            (mes==4 && dia>30) ||
            (mes==6 && dia>30) ||
            (mes==9 && dia>30) ||
            (mes==11 && dia>30)  ){
            return false;
        }
        return true;
    }

    public boolean isPreco(String preco){
        if(!preco.substring(0, 3).equals("R$ ")){
            return false;
        }
        if(!isDouble(preco.substring(3).replace(',', '.'))){
            return false;
        }
        return true;
    }
    
    public boolean isRG(String rg){
        if(rg.length()!=12){
            return false;
        }
        if(rg.charAt(2)!='.' || rg.charAt(6)!='.' || rg.charAt(10)!='-'){
            return false;
        }
        if(!isInt(rg.substring(0, 2)) || !isInt(rg.substring(3, 6)) || !isInt(rg.substring(7, 10))){
            return false;
        }
        return true;
    }
    
    public boolean isCPF(String cpf){
        if(cpf.length()!=14){
            return false;
        }
        if(!isInt(cpf.substring(0, 3)) || !isInt(cpf.substring(4, 7)) || !isInt(cpf.substring(8, 11)) || !isInt(cpf.substring(12, 14))){
            return false;
        }
        if(cpf.charAt(3)!='.' || cpf.charAt(7)!='.' || cpf.charAt(11)!='-'){
            return false;
        }
        return true;
    }
    
    public boolean isCEP(String cep){
        if(cep.length()!=9){
            return false;
        }
        if(!isInt(cep.substring(0, 5)) || !isInt(cep.substring(6, 9))){
            return false;
        }
        if(cep.charAt(5)!='-'){
            return false;
        }
        return true;
    }
    
    public boolean isFone(String fone){
        switch (fone.length()) {
            case 15:
                if(!isInt(fone.substring(1, 3)) || !isInt(""+fone.charAt(4)) || !isInt(fone.substring(6, 10)) || !isInt(fone.substring(11, 15))){
                    return false;
                }
                
                if(fone.charAt(0)!='(' || fone.charAt(3)!=')' || fone.charAt(5)!=' ' || fone.charAt(10)!='-'){
                    return false;
                }
                
                return true;
            case 14:
                if(!isInt(fone.substring(1, 3)) || !isInt(fone.substring(5, 9)) || !isInt(fone.substring(10, 14))){
                    return false;
                }
                
                if(fone.charAt(0)!='(' || fone.charAt(3)!=')' || fone.charAt(4)!=' ' || fone.charAt(9)!='-'){
                    return false;
                }
                
                return true;
            default:
                return false;
        }
    }
    
    public String foneToInteger(String fone){
        if(fone.length()==15){
            return fone.substring(1, 3)+fone.charAt(4)+fone.substring(6, 10)+fone.substring(11,15);
        }
        if(fone.length()==14){
            return fone.substring(1, 3)+fone.substring(5, 9)+fone.substring(10, 14);
        }
        return "";
    }
    
    public String dateToSql(String date){
        return date.substring(6)+"-"+date.substring(3, 5)+"-"+date.substring(0, 2);
    }
    
    public String sqlToDate(String sql){
        return sql.substring(8)+"/"+sql.substring(5,7)+"/"+sql.substring(0,4);
    }
}

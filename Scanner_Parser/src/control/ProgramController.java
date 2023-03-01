package control;

import model.List;
import model.Token;

import java.util.Objects;

public class ProgramController {

    private List<Token> tokenList = new List<>();

    public ProgramController(){

    }

    public void startingProgramm(){
        new ViewController();

    }

    public boolean scan(String input){
        if(!Objects.equals(input, "")){
            clearList(tokenList);
            char first, two;
            input = input + '#';
            for (int i = 0; input.charAt(i) != '#'; i += 2) {
                first = input.charAt(i);
                two = input.charAt(i + 1);
                if(first == 'l'){
                    switch (two){
                        case 'a':
                        case 'e':
                            tokenList.append(new Token("any"));
                            break;
                        case 'u':
                            tokenList.append(new Token("end"));
                            break;
                        default:
                            break;
                    }
                }else{
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public boolean parse() {
        tokenList.toLast();
        return Objects.equals(tokenList.getContent().getName(), "end");
    }

    public void clearList(List<Token> list){
        list.toFirst();
        while(list.hasAccess()){
            list.remove();
        }
    }

    /*
    public boolean pruefeS(){
        if(tokenList.hasAccess() && tokenList.getContent().getName() == "any" || tokenList.getContent().getName() == "end"){
            tokenList.next();
            return pruefeA();
        }else{
            return false;
        }
    }

    public boolean pruefeA(){
        if(tokenList.hasAccess() && tokenList.getContent().getName() == "any" || tokenList.getContent().getName() == "end"){
            tokenList.next();
            return pruefeB();
        }else{
            return false;
        }
    }

    public boolean pruefeB(){
        if(tokenList.hasAccess() && tokenList.getContent().getName() == "end"){
            return true;
        }else{
            return false;
        }
    }
    */
}


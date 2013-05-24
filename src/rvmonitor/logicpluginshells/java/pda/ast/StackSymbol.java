package rvmonitor.logicpluginshells.java.pda.ast;

import rvmonitor.logicpluginshells.java.pda.visitor.DumpVisitor;
import rvmonitor.logicpluginshells.java.pda.visitor.GenericVisitor;
import rvmonitor.logicpluginshells.java.pda.visitor.VoidVisitor;


public class StackSymbol {
	String symbol;
	
	public StackSymbol(String symbol){
		this.symbol = symbol;
	}
	
	public String getSymbol(){
		return symbol;
	}
	
    public <A> void accept(VoidVisitor<A> v, A arg) {
        v.visit(this, arg);
    }

    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public final String toString() {
        DumpVisitor visitor = new DumpVisitor();
        String formula = accept(visitor, null);
        return formula;
    }

	@Override
	public boolean equals(Object o){
		if(!(o instanceof StackSymbol))
			return false;
		return symbol.equals(((StackSymbol)o).getSymbol());
	}
}
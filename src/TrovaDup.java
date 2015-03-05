import java.util.LinkedList;
import java.util.List;

/**
 * Questa classe astratta implementa l'interfaccia AlgoDup e implemente solamente
 * il metodo getDup che si occupa dell'individuazione dei duplicati interni alla 
 * lista.
 * 
 * @author simonecappabianca
 *
 */
public abstract class TrovaDup implements AlgoDup {

	@Override
	public boolean verificaDup(List S) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List getDup(List S) {
		List dup = new LinkedList();
		for(int i=0;i<S.size();i++){
			Object x=S.get(i);
			for(int j=i+1;j<S.size();j++){
				Object y=S.get(j);
				if(x.equals(y))
					dup.add(x);
			}
		}
		return dup;
	}

}

package interviewedQuestions;

import java.util.List;


//First approach using a class Term
public class DerivationProblem {
	class Term{
		int exp;
		int coef;
	}
	public List<Term> derivate(List<Term> poly){
		for(int i=0; i<poly.size();i++){
			Term term = poly.get(i);
			if(term.exp!=0){
				term.coef=term.coef * term.exp;
				term.exp=term.exp-1;
			} else {
				poly.remove(i);
			}
			
		}
		return poly;
	}
}

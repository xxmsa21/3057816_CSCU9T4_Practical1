// An implementation of a Training Record as an ArrayList
package stir.ae;




import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
	   if (!tr.contains(e)) {
		   tr.add(e);    
	   }
   } // addClass
   
   public boolean containsEntry(String n, int d, int m, int y) {
	    for (Entry e : tr) {
	        if (e.getName().equals(n) && e.getDay() == d
	                && e.getMonth() == m && e.getYear() == y) {
	            return true;
	        }
	    }
	    return false;
	}
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   public String FindAll_by_date(int d, int m, int y) {
	   ListIterator<Entry> iter = tr.listIterator();
       String result = "";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result += current.getEntry() + ' ';
            }
       return result;
   }
   
   public String FindAll_by_name(String n) {
	   ListIterator<Entry> iter = tr.listIterator();
       String result = "";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if ((current.getName()).compareToIgnoreCase(n) == 0) 
             result += current.getEntry() + ' ';
            }
       return result;
   }
   
   public void removeEntry(String n, int d, int m, int y) {
	   ListIterator<Entry> iter = tr.listIterator();
       while (iter.hasNext()) {
          Entry current = iter.next();
          if ((current.getName()).compareToIgnoreCase(n) == 0 && current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
        	  iter.remove();
       }
   }
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord
package leckerMensa.domain.mensa;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
public class Speise
{
	/**
	 * So heists
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Column(name = "NAMECOLUMN")
	protected String name;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.ElementCollection
	protected  final List<Ausstattung> ausstattung;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.ElementCollection
	protected Set<Zutaten> zutaten;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	protected Long id;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Speise(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getName() {
		return this.name;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public List<Ausstattung> getAusstattung() {
		if(this.ausstattung == null) {
				this.ausstattung = new LinkedList<Ausstattung>();
		}
		return (List<Ausstattung>) this.ausstattung;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Zutaten> getZutaten() {
		if(this.zutaten == null) {
				this.zutaten = new HashSet<Zutaten>();
		}
		return (Set<Zutaten>) this.zutaten;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getId() {
		return this.id;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllAusstattung(List<Ausstattung> newAusstattung) {
		if (this.ausstattung == null) {
			this.ausstattung = new LinkedList<Ausstattung>();
		}
		this.ausstattung.addAll(newAusstattung);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllZutaten(Set<Zutaten> newZutaten) {
		if (this.zutaten == null) {
			this.zutaten = new HashSet<Zutaten>();
		}
		this.zutaten.addAll(newZutaten);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllAusstattung(List<Ausstattung> newAusstattung) {
		if(this.ausstattung == null) {
			return;
		}
		
		this.ausstattung.removeAll(newAusstattung);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllZutaten(Set<Zutaten> newZutaten) {
		if(this.zutaten == null) {
			return;
		}
		
		this.zutaten.removeAll(newZutaten);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setName(String myName) {
		this.name = myName;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAusstattung(Ausstattung newAusstattung) {
		if(this.ausstattung == null) {
			this.ausstattung = new LinkedList<Ausstattung>();
		}
		
		this.ausstattung.add(newAusstattung);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addZutaten(Zutaten newZutaten) {
		if(this.zutaten == null) {
			this.zutaten = new HashSet<Zutaten>();
		}
		
		this.zutaten.add(newZutaten);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setId(long myId) {
		this.id = myId;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetName() {
		this.name = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAusstattung(Ausstattung oldAusstattung) {
		if(this.ausstattung == null)
			return;
		
		this.ausstattung.remove(oldAusstattung);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeZutaten(Zutaten oldZutaten) {
		if(this.zutaten == null)
			return;
		
		this.zutaten.remove(oldZutaten);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetId() {
		this.id = 0L;	
	}
	
}


package leckerMensa.domain.mensa;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;
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
	 
	@javax.persistence.Column(nullable = false) 
	protected String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING) 
	@javax.persistence.ElementCollection(targetClass = Ausstattung.class) 
	protected final List<Ausstattung> ausstattung = new LinkedList<Ausstattung>();

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToMany 
	@javax.persistence.JoinTable 
	@javax.persistence.JoinColumn(nullable = false) 
	protected Set<Zutaten> zutaten;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id 
	@javax.persistence.Column(nullable = false) 
	protected final Long id = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Speise(){
		super();
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
	
}


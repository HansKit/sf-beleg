/**
 * generated by Xtext 2.35.0
 */
package de.htwdd.sf.beleg.s83765s83768.dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.htwdd.sf.beleg.s83765s83768.dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.htwdd.de/sf/beleg/s83765s83768/Dsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslPackage eINSTANCE = de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl.init();

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.ModelImpl
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Stories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STORIES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.StoryImpl <em>Story</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.StoryImpl
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl#getStory()
   * @generated
   */
  int STORY = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY__TITLE = 0;

  /**
   * The feature id for the '<em><b>Dp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY__DP = 1;

  /**
   * The feature id for the '<em><b>Benefit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY__BENEFIT = 2;

  /**
   * The feature id for the '<em><b>Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY__ROLE = 3;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY__ACTION = 4;

  /**
   * The number of structural features of the '<em>Story</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.TitleImpl <em>Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.TitleImpl
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl#getTitle()
   * @generated
   */
  int TITLE = 2;

  /**
   * The feature id for the '<em><b>Noun</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__NOUN = 0;

  /**
   * The feature id for the '<em><b>Verb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__VERB = 1;

  /**
   * The number of structural features of the '<em>Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.BenefitImpl <em>Benefit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.BenefitImpl
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl#getBenefit()
   * @generated
   */
  int BENEFIT = 3;

  /**
   * The feature id for the '<em><b>Noun</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENEFIT__NOUN = 0;

  /**
   * The feature id for the '<em><b>Pzvi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENEFIT__PZVI = 1;

  /**
   * The number of structural features of the '<em>Benefit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENEFIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.RoleImpl
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl#getRole()
   * @generated
   */
  int ROLE = 4;

  /**
   * The feature id for the '<em><b>Noun</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NOUN = 0;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.ActionImpl
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl#getAction()
   * @generated
   */
  int ACTION = 5;

  /**
   * The feature id for the '<em><b>Noun</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NOUN = 0;

  /**
   * The feature id for the '<em><b>Vi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__VI = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Model#getStories <em>Stories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stories</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Model#getStories()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Stories();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Story <em>Story</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Story</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Story
   * @generated
   */
  EClass getStory();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Story#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Story#getTitle()
   * @see #getStory()
   * @generated
   */
  EReference getStory_Title();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Story#getDp <em>Dp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dp</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Story#getDp()
   * @see #getStory()
   * @generated
   */
  EAttribute getStory_Dp();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Story#getBenefit <em>Benefit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Benefit</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Story#getBenefit()
   * @see #getStory()
   * @generated
   */
  EReference getStory_Benefit();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Story#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Role</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Story#getRole()
   * @see #getStory()
   * @generated
   */
  EReference getStory_Role();

  /**
   * Returns the meta object for the containment reference '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Story#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Story#getAction()
   * @see #getStory()
   * @generated
   */
  EReference getStory_Action();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Title</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Title
   * @generated
   */
  EClass getTitle();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Title#getNoun <em>Noun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Noun</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Title#getNoun()
   * @see #getTitle()
   * @generated
   */
  EAttribute getTitle_Noun();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Title#getVerb <em>Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verb</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Title#getVerb()
   * @see #getTitle()
   * @generated
   */
  EAttribute getTitle_Verb();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Benefit <em>Benefit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Benefit</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Benefit
   * @generated
   */
  EClass getBenefit();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Benefit#getNoun <em>Noun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Noun</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Benefit#getNoun()
   * @see #getBenefit()
   * @generated
   */
  EAttribute getBenefit_Noun();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Benefit#getPzvi <em>Pzvi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pzvi</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Benefit#getPzvi()
   * @see #getBenefit()
   * @generated
   */
  EAttribute getBenefit_Pzvi();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Role#getNoun <em>Noun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Noun</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Role#getNoun()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Noun();

  /**
   * Returns the meta object for class '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Action#getNoun <em>Noun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Noun</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Action#getNoun()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Noun();

  /**
   * Returns the meta object for the attribute '{@link de.htwdd.sf.beleg.s83765s83768.dsl.Action#getVi <em>Vi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vi</em>'.
   * @see de.htwdd.sf.beleg.s83765s83768.dsl.Action#getVi()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Vi();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DslFactory getDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.ModelImpl
     * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Stories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STORIES = eINSTANCE.getModel_Stories();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.StoryImpl <em>Story</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.StoryImpl
     * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl#getStory()
     * @generated
     */
    EClass STORY = eINSTANCE.getStory();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORY__TITLE = eINSTANCE.getStory_Title();

    /**
     * The meta object literal for the '<em><b>Dp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORY__DP = eINSTANCE.getStory_Dp();

    /**
     * The meta object literal for the '<em><b>Benefit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORY__BENEFIT = eINSTANCE.getStory_Benefit();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORY__ROLE = eINSTANCE.getStory_Role();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORY__ACTION = eINSTANCE.getStory_Action();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.TitleImpl <em>Title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.TitleImpl
     * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl#getTitle()
     * @generated
     */
    EClass TITLE = eINSTANCE.getTitle();

    /**
     * The meta object literal for the '<em><b>Noun</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TITLE__NOUN = eINSTANCE.getTitle_Noun();

    /**
     * The meta object literal for the '<em><b>Verb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TITLE__VERB = eINSTANCE.getTitle_Verb();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.BenefitImpl <em>Benefit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.BenefitImpl
     * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl#getBenefit()
     * @generated
     */
    EClass BENEFIT = eINSTANCE.getBenefit();

    /**
     * The meta object literal for the '<em><b>Noun</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BENEFIT__NOUN = eINSTANCE.getBenefit_Noun();

    /**
     * The meta object literal for the '<em><b>Pzvi</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BENEFIT__PZVI = eINSTANCE.getBenefit_Pzvi();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.RoleImpl
     * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Noun</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__NOUN = eINSTANCE.getRole_Noun();

    /**
     * The meta object literal for the '{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.ActionImpl
     * @see de.htwdd.sf.beleg.s83765s83768.dsl.impl.DslPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Noun</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NOUN = eINSTANCE.getAction_Noun();

    /**
     * The meta object literal for the '<em><b>Vi</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__VI = eINSTANCE.getAction_Vi();

  }

} //DslPackage

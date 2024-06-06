/**
 * generated by Xtext 2.35.0
 */
package de.htwdd.sf.beleg.s83765s83768.dsl.impl;

import de.htwdd.sf.beleg.s83765s83768.dsl.Action;
import de.htwdd.sf.beleg.s83765s83768.dsl.Benefit;
import de.htwdd.sf.beleg.s83765s83768.dsl.DslPackage;
import de.htwdd.sf.beleg.s83765s83768.dsl.Role;
import de.htwdd.sf.beleg.s83765s83768.dsl.Story;
import de.htwdd.sf.beleg.s83765s83768.dsl.Title;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Story</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.StoryImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.StoryImpl#getDp <em>Dp</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.StoryImpl#getBenefit <em>Benefit</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.StoryImpl#getRole <em>Role</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s83765s83768.dsl.impl.StoryImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoryImpl extends MinimalEObjectImpl.Container implements Story
{
  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected Title title;

  /**
   * The default value of the '{@link #getDp() <em>Dp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDp()
   * @generated
   * @ordered
   */
  protected static final String DP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDp() <em>Dp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDp()
   * @generated
   * @ordered
   */
  protected String dp = DP_EDEFAULT;

  /**
   * The cached value of the '{@link #getBenefit() <em>Benefit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBenefit()
   * @generated
   * @ordered
   */
  protected Benefit benefit;

  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected Role role;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslPackage.Literals.STORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Title getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTitle(Title newTitle, NotificationChain msgs)
  {
    Title oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.STORY__TITLE, oldTitle, newTitle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTitle(Title newTitle)
  {
    if (newTitle != title)
    {
      NotificationChain msgs = null;
      if (title != null)
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.STORY__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.STORY__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.STORY__TITLE, newTitle, newTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDp()
  {
    return dp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDp(String newDp)
  {
    String oldDp = dp;
    dp = newDp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.STORY__DP, oldDp, dp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Benefit getBenefit()
  {
    return benefit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBenefit(Benefit newBenefit, NotificationChain msgs)
  {
    Benefit oldBenefit = benefit;
    benefit = newBenefit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.STORY__BENEFIT, oldBenefit, newBenefit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBenefit(Benefit newBenefit)
  {
    if (newBenefit != benefit)
    {
      NotificationChain msgs = null;
      if (benefit != null)
        msgs = ((InternalEObject)benefit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.STORY__BENEFIT, null, msgs);
      if (newBenefit != null)
        msgs = ((InternalEObject)newBenefit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.STORY__BENEFIT, null, msgs);
      msgs = basicSetBenefit(newBenefit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.STORY__BENEFIT, newBenefit, newBenefit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Role getRole()
  {
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRole(Role newRole, NotificationChain msgs)
  {
    Role oldRole = role;
    role = newRole;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.STORY__ROLE, oldRole, newRole);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRole(Role newRole)
  {
    if (newRole != role)
    {
      NotificationChain msgs = null;
      if (role != null)
        msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.STORY__ROLE, null, msgs);
      if (newRole != null)
        msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.STORY__ROLE, null, msgs);
      msgs = basicSetRole(newRole, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.STORY__ROLE, newRole, newRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(Action newAction, NotificationChain msgs)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.STORY__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAction(Action newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.STORY__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.STORY__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.STORY__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DslPackage.STORY__TITLE:
        return basicSetTitle(null, msgs);
      case DslPackage.STORY__BENEFIT:
        return basicSetBenefit(null, msgs);
      case DslPackage.STORY__ROLE:
        return basicSetRole(null, msgs);
      case DslPackage.STORY__ACTION:
        return basicSetAction(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslPackage.STORY__TITLE:
        return getTitle();
      case DslPackage.STORY__DP:
        return getDp();
      case DslPackage.STORY__BENEFIT:
        return getBenefit();
      case DslPackage.STORY__ROLE:
        return getRole();
      case DslPackage.STORY__ACTION:
        return getAction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.STORY__TITLE:
        setTitle((Title)newValue);
        return;
      case DslPackage.STORY__DP:
        setDp((String)newValue);
        return;
      case DslPackage.STORY__BENEFIT:
        setBenefit((Benefit)newValue);
        return;
      case DslPackage.STORY__ROLE:
        setRole((Role)newValue);
        return;
      case DslPackage.STORY__ACTION:
        setAction((Action)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.STORY__TITLE:
        setTitle((Title)null);
        return;
      case DslPackage.STORY__DP:
        setDp(DP_EDEFAULT);
        return;
      case DslPackage.STORY__BENEFIT:
        setBenefit((Benefit)null);
        return;
      case DslPackage.STORY__ROLE:
        setRole((Role)null);
        return;
      case DslPackage.STORY__ACTION:
        setAction((Action)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.STORY__TITLE:
        return title != null;
      case DslPackage.STORY__DP:
        return DP_EDEFAULT == null ? dp != null : !DP_EDEFAULT.equals(dp);
      case DslPackage.STORY__BENEFIT:
        return benefit != null;
      case DslPackage.STORY__ROLE:
        return role != null;
      case DslPackage.STORY__ACTION:
        return action != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (dp: ");
    result.append(dp);
    result.append(')');
    return result.toString();
  }

} //StoryImpl

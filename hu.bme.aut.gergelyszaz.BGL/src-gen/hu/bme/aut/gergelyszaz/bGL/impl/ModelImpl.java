/**
 */
package hu.bme.aut.gergelyszaz.bGL.impl;

import hu.bme.aut.gergelyszaz.bGL.BGLPackage;
import hu.bme.aut.gergelyszaz.bGL.Board;
import hu.bme.aut.gergelyszaz.bGL.Model;
import hu.bme.aut.gergelyszaz.bGL.Player;
import hu.bme.aut.gergelyszaz.bGL.Rules;
import hu.bme.aut.gergelyszaz.bGL.Token;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.ModelImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.ModelImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.ModelImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.ModelImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPlayer() <em>Player</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlayer()
   * @generated
   * @ordered
   */
  protected Player player;

  /**
   * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoard()
   * @generated
   * @ordered
   */
  protected Board board;

  /**
   * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTokens()
   * @generated
   * @ordered
   */
  protected EList<Token> tokens;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected Rules rules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return BGLPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BGLPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Player getPlayer()
  {
    return player;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlayer(Player newPlayer, NotificationChain msgs)
  {
    Player oldPlayer = player;
    player = newPlayer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BGLPackage.MODEL__PLAYER, oldPlayer, newPlayer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlayer(Player newPlayer)
  {
    if (newPlayer != player)
    {
      NotificationChain msgs = null;
      if (player != null)
        msgs = ((InternalEObject)player).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BGLPackage.MODEL__PLAYER, null, msgs);
      if (newPlayer != null)
        msgs = ((InternalEObject)newPlayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BGLPackage.MODEL__PLAYER, null, msgs);
      msgs = basicSetPlayer(newPlayer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BGLPackage.MODEL__PLAYER, newPlayer, newPlayer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Board getBoard()
  {
    return board;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs)
  {
    Board oldBoard = board;
    board = newBoard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BGLPackage.MODEL__BOARD, oldBoard, newBoard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoard(Board newBoard)
  {
    if (newBoard != board)
    {
      NotificationChain msgs = null;
      if (board != null)
        msgs = ((InternalEObject)board).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BGLPackage.MODEL__BOARD, null, msgs);
      if (newBoard != null)
        msgs = ((InternalEObject)newBoard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BGLPackage.MODEL__BOARD, null, msgs);
      msgs = basicSetBoard(newBoard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BGLPackage.MODEL__BOARD, newBoard, newBoard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Token> getTokens()
  {
    if (tokens == null)
    {
      tokens = new EObjectContainmentEList<Token>(Token.class, this, BGLPackage.MODEL__TOKENS);
    }
    return tokens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rules getRules()
  {
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRules(Rules newRules, NotificationChain msgs)
  {
    Rules oldRules = rules;
    rules = newRules;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BGLPackage.MODEL__RULES, oldRules, newRules);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRules(Rules newRules)
  {
    if (newRules != rules)
    {
      NotificationChain msgs = null;
      if (rules != null)
        msgs = ((InternalEObject)rules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BGLPackage.MODEL__RULES, null, msgs);
      if (newRules != null)
        msgs = ((InternalEObject)newRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BGLPackage.MODEL__RULES, null, msgs);
      msgs = basicSetRules(newRules, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BGLPackage.MODEL__RULES, newRules, newRules));
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
      case BGLPackage.MODEL__PLAYER:
        return basicSetPlayer(null, msgs);
      case BGLPackage.MODEL__BOARD:
        return basicSetBoard(null, msgs);
      case BGLPackage.MODEL__TOKENS:
        return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
      case BGLPackage.MODEL__RULES:
        return basicSetRules(null, msgs);
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
      case BGLPackage.MODEL__NAME:
        return getName();
      case BGLPackage.MODEL__PLAYER:
        return getPlayer();
      case BGLPackage.MODEL__BOARD:
        return getBoard();
      case BGLPackage.MODEL__TOKENS:
        return getTokens();
      case BGLPackage.MODEL__RULES:
        return getRules();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BGLPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case BGLPackage.MODEL__PLAYER:
        setPlayer((Player)newValue);
        return;
      case BGLPackage.MODEL__BOARD:
        setBoard((Board)newValue);
        return;
      case BGLPackage.MODEL__TOKENS:
        getTokens().clear();
        getTokens().addAll((Collection<? extends Token>)newValue);
        return;
      case BGLPackage.MODEL__RULES:
        setRules((Rules)newValue);
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
      case BGLPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BGLPackage.MODEL__PLAYER:
        setPlayer((Player)null);
        return;
      case BGLPackage.MODEL__BOARD:
        setBoard((Board)null);
        return;
      case BGLPackage.MODEL__TOKENS:
        getTokens().clear();
        return;
      case BGLPackage.MODEL__RULES:
        setRules((Rules)null);
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
      case BGLPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BGLPackage.MODEL__PLAYER:
        return player != null;
      case BGLPackage.MODEL__BOARD:
        return board != null;
      case BGLPackage.MODEL__TOKENS:
        return tokens != null && !tokens.isEmpty();
      case BGLPackage.MODEL__RULES:
        return rules != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ModelImpl

package com.gopawpaw.erp.hibernate.q;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * QaddbCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.q.QaddbCtrl
 * @author MyEclipse Persistence Tools
 */

public class QaddbCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(QaddbCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(QaddbCtrl transientInstance) {
		log.debug("saving QaddbCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QaddbCtrl persistentInstance) {
		log.debug("deleting QaddbCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QaddbCtrl findById(java.lang.Integer id) {
		log.debug("getting QaddbCtrl instance with id: " + id);
		try {
			QaddbCtrl instance = (QaddbCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.q.QaddbCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QaddbCtrl instance) {
		log.debug("finding QaddbCtrl instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding QaddbCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from QaddbCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all QaddbCtrl instances");
		try {
			String queryString = "from QaddbCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QaddbCtrl merge(QaddbCtrl detachedInstance) {
		log.debug("merging QaddbCtrl instance");
		try {
			QaddbCtrl result = (QaddbCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QaddbCtrl instance) {
		log.debug("attaching dirty QaddbCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QaddbCtrl instance) {
		log.debug("attaching clean QaddbCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static QaddbCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (QaddbCtrlDAO) ctx.getBean("QaddbCtrlDAO");
	}
}
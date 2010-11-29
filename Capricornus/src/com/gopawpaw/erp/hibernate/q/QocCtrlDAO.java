package com.gopawpaw.erp.hibernate.q;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * QocCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.q.QocCtrl
 * @author MyEclipse Persistence Tools
 */

public class QocCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(QocCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(QocCtrl transientInstance) {
		log.debug("saving QocCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QocCtrl persistentInstance) {
		log.debug("deleting QocCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QocCtrl findById(java.lang.String id) {
		log.debug("getting QocCtrl instance with id: " + id);
		try {
			QocCtrl instance = (QocCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.q.QocCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QocCtrl instance) {
		log.debug("finding QocCtrl instance by example");
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
		log.debug("finding QocCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from QocCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all QocCtrl instances");
		try {
			String queryString = "from QocCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QocCtrl merge(QocCtrl detachedInstance) {
		log.debug("merging QocCtrl instance");
		try {
			QocCtrl result = (QocCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QocCtrl instance) {
		log.debug("attaching dirty QocCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QocCtrl instance) {
		log.debug("attaching clean QocCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static QocCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (QocCtrlDAO) ctx.getBean("QocCtrlDAO");
	}
}
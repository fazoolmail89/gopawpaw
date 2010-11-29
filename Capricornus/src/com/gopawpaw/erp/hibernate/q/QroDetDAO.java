package com.gopawpaw.erp.hibernate.q;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * QroDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.q.QroDet
 * @author MyEclipse Persistence Tools
 */

public class QroDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(QroDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(QroDet transientInstance) {
		log.debug("saving QroDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(QroDet persistentInstance) {
		log.debug("deleting QroDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public QroDet findById(com.gopawpaw.erp.hibernate.q.QroDetId id) {
		log.debug("getting QroDet instance with id: " + id);
		try {
			QroDet instance = (QroDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.q.QroDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(QroDet instance) {
		log.debug("finding QroDet instance by example");
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
		log.debug("finding QroDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from QroDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all QroDet instances");
		try {
			String queryString = "from QroDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public QroDet merge(QroDet detachedInstance) {
		log.debug("merging QroDet instance");
		try {
			QroDet result = (QroDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(QroDet instance) {
		log.debug("attaching dirty QroDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(QroDet instance) {
		log.debug("attaching clean QroDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static QroDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (QroDetDAO) ctx.getBean("QroDetDAO");
	}
}
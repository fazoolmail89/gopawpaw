package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KnbadcHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KnbadcHist
 * @author MyEclipse Persistence Tools
 */

public class KnbadcHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KnbadcHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KnbadcHist transientInstance) {
		log.debug("saving KnbadcHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KnbadcHist persistentInstance) {
		log.debug("deleting KnbadcHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KnbadcHist findById(com.gopawpaw.erp.hibernate.k.KnbadcHistId id) {
		log.debug("getting KnbadcHist instance with id: " + id);
		try {
			KnbadcHist instance = (KnbadcHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KnbadcHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KnbadcHist instance) {
		log.debug("finding KnbadcHist instance by example");
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
		log.debug("finding KnbadcHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KnbadcHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KnbadcHist instances");
		try {
			String queryString = "from KnbadcHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KnbadcHist merge(KnbadcHist detachedInstance) {
		log.debug("merging KnbadcHist instance");
		try {
			KnbadcHist result = (KnbadcHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KnbadcHist instance) {
		log.debug("attaching dirty KnbadcHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KnbadcHist instance) {
		log.debug("attaching clean KnbadcHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KnbadcHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KnbadcHistDAO) ctx.getBean("KnbadcHistDAO");
	}
}
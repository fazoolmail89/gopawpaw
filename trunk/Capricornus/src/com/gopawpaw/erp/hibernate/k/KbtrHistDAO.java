package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KbtrHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KbtrHist
 * @author MyEclipse Persistence Tools
 */

public class KbtrHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KbtrHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KbtrHist transientInstance) {
		log.debug("saving KbtrHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KbtrHist persistentInstance) {
		log.debug("deleting KbtrHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KbtrHist findById(com.gopawpaw.erp.hibernate.k.KbtrHistId id) {
		log.debug("getting KbtrHist instance with id: " + id);
		try {
			KbtrHist instance = (KbtrHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KbtrHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KbtrHist instance) {
		log.debug("finding KbtrHist instance by example");
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
		log.debug("finding KbtrHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KbtrHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KbtrHist instances");
		try {
			String queryString = "from KbtrHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KbtrHist merge(KbtrHist detachedInstance) {
		log.debug("merging KbtrHist instance");
		try {
			KbtrHist result = (KbtrHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KbtrHist instance) {
		log.debug("attaching dirty KbtrHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KbtrHist instance) {
		log.debug("attaching clean KbtrHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KbtrHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KbtrHistDAO) ctx.getBean("KbtrHistDAO");
	}
}
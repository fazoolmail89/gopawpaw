package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PghHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PghHist
 * @author MyEclipse Persistence Tools
 */

public class PghHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PghHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PghHist transientInstance) {
		log.debug("saving PghHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PghHist persistentInstance) {
		log.debug("deleting PghHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PghHist findById(com.gopawpaw.erp.hibernate.p.PghHistId id) {
		log.debug("getting PghHist instance with id: " + id);
		try {
			PghHist instance = (PghHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PghHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PghHist instance) {
		log.debug("finding PghHist instance by example");
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
		log.debug("finding PghHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PghHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PghHist instances");
		try {
			String queryString = "from PghHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PghHist merge(PghHist detachedInstance) {
		log.debug("merging PghHist instance");
		try {
			PghHist result = (PghHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PghHist instance) {
		log.debug("attaching dirty PghHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PghHist instance) {
		log.debug("attaching clean PghHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PghHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PghHistDAO) ctx.getBean("PghHistDAO");
	}
}
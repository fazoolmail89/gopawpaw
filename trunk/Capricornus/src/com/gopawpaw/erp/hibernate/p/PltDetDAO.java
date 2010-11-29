package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PltDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PltDet
 * @author MyEclipse Persistence Tools
 */

public class PltDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PltDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PltDet transientInstance) {
		log.debug("saving PltDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PltDet persistentInstance) {
		log.debug("deleting PltDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PltDet findById(com.gopawpaw.erp.hibernate.p.PltDetId id) {
		log.debug("getting PltDet instance with id: " + id);
		try {
			PltDet instance = (PltDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PltDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PltDet instance) {
		log.debug("finding PltDet instance by example");
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
		log.debug("finding PltDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PltDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PltDet instances");
		try {
			String queryString = "from PltDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PltDet merge(PltDet detachedInstance) {
		log.debug("merging PltDet instance");
		try {
			PltDet result = (PltDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PltDet instance) {
		log.debug("attaching dirty PltDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PltDet instance) {
		log.debug("attaching clean PltDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PltDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PltDetDAO) ctx.getBean("PltDetDAO");
	}
}
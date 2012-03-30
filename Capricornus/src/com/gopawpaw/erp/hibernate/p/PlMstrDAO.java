package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PlMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PlMstr
 * @author MyEclipse Persistence Tools
 */

public class PlMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PlMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PlMstr transientInstance) {
		log.debug("saving PlMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PlMstr persistentInstance) {
		log.debug("deleting PlMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PlMstr findById(com.gopawpaw.erp.hibernate.p.PlMstrId id) {
		log.debug("getting PlMstr instance with id: " + id);
		try {
			PlMstr instance = (PlMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PlMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PlMstr instance) {
		log.debug("finding PlMstr instance by example");
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
		log.debug("finding PlMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PlMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PlMstr instances");
		try {
			String queryString = "from PlMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PlMstr merge(PlMstr detachedInstance) {
		log.debug("merging PlMstr instance");
		try {
			PlMstr result = (PlMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PlMstr instance) {
		log.debug("attaching dirty PlMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PlMstr instance) {
		log.debug("attaching clean PlMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PlMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PlMstrDAO) ctx.getBean("PlMstrDAO");
	}
}